package com.group.pbox.pvbs.clientmodel.termdeposit;

import java.sql.Timestamp;
import java.util.Date;

public class TermDepositRespData
{
    private String id;

    private String accountId;

    private String accountNum;

    private String depositNumber;

    private double depositAmount;

    private String termPeriod;

    private double termInterestRate;

    private Date maturityDate;

    private double maturityInterest;

    private double maturityAmount;

    private String maturityStatus;

    private Timestamp createTime;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }

    public String getDepositNumber()
    {
        return depositNumber;
    }

    public void setDepositNumber(String depositNumber)
    {
        this.depositNumber = depositNumber;
    }

    public double getDepositAmount()
    {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount)
    {
        this.depositAmount = depositAmount;
    }

    public String getTermPeriod()
    {
        return termPeriod;
    }

    public void setTermPeriod(String termPeriod)
    {
        this.termPeriod = termPeriod;
    }

    public double getTermInterestRate()
    {
        return termInterestRate;
    }

    public void setTermInterestRate(double termInterestRate)
    {
        this.termInterestRate = termInterestRate;
    }

    public Date getMaturityDate()
    {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate)
    {
        this.maturityDate = maturityDate;
    }

    public double getMaturityInterest()
    {
        return maturityInterest;
    }

    public void setMaturityInterest(double maturityInterest)
    {
        this.maturityInterest = maturityInterest;
    }

    public double getMaturityAmount()
    {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount)
    {
        this.maturityAmount = maturityAmount;
    }

    public String getAccountNum()
    {
        return accountNum;
    }

    public void setAccountNum(String accountNum)
    {
        this.accountNum = accountNum;
    }

    public String getMaturityStatus()
    {
        return maturityStatus;
    }

    public void setMaturityStatus(String maturityStatus)
    {
        this.maturityStatus = maturityStatus;
    }

    public Timestamp getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime)
    {
        this.createTime = createTime;
    }

}
