package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.StitchesLogo: ImageVector
    get() {
        if (_StitchesLogo != null) return _StitchesLogo!!
        
        _StitchesLogo = ImageVector.Builder(
            name = "stitches-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50037f, 0.849976f)
                curveTo(11.1729f, 0.850187f, 14.1498f, 3.8278f, 14.1498f, 7.50037f)
                curveTo(14.1496f, 11.1728f, 11.1728f, 14.1496f, 7.50037f, 14.1498f)
                curveTo(3.8278f, 14.1498f, 0.850187f, 11.1729f, 0.849976f, 7.50037f)
                curveTo(0.849976f, 3.82767f, 3.82767f, 0.849976f, 7.50037f, 0.849976f)
                close()
                moveTo(6.849f, 13.1107f)
                curveTo(7.06279f, 13.1353f, 7.28f, 13.1498f, 7.50037f, 13.1498f)
                curveTo(9.82469f, 13.1496f, 11.8197f, 11.7455f, 12.6869f, 9.73962f)
                lineTo(6.849f, 13.1107f)
                close()
                moveTo(7.82556f, 5.19861f)
                lineTo(11.3617f, 7.82068f)
                lineTo(11.4291f, 7.8822f)
                curveTo(11.5687f, 8.03804f, 11.5849f, 8.2759f, 11.4554f, 8.45056f)
                curveTo(11.4175f, 8.50156f, 11.3695f, 8.53992f, 11.3177f, 8.5697f)
                lineTo(11.3187f, 8.57166f)
                lineTo(9.87341f, 9.40466f)
                curveTo(9.87024f, 9.40677f, 9.86687f, 9.40851f, 9.86365f, 9.41052f)
                lineTo(8.41052f, 10.2484f)
                curveTo(8.39769f, 10.2573f, 8.38405f, 10.2644f, 8.37048f, 10.2719f)
                lineTo(4.68689f, 12.3988f)
                curveTo(4.96677f, 12.5599f, 5.26129f, 12.6981f, 5.56873f, 12.8099f)
                lineTo(13.0619f, 8.48376f)
                curveTo(13.118f, 8.16426f, 13.1498f, 7.83595f, 13.1498f, 7.50037f)
                curveTo(13.1498f, 5.80215f, 12.4001f, 4.27935f, 11.2142f, 3.24353f)
                lineTo(7.82556f, 5.19861f)
                close()
                moveTo(1.91248f, 6.65564f)
                curveTo(1.87116f, 6.9312f, 1.84998f, 7.2133f, 1.84998f, 7.50037f)
                curveTo(1.85009f, 9.23964f, 2.63716f, 10.7941f, 3.87341f, 11.8304f)
                lineTo(7.32361f, 9.83728f)
                lineTo(3.72498f, 7.26501f)
                lineTo(3.71814f, 7.25818f)
                curveTo(3.69841f, 7.24351f, 3.6798f, 7.22741f, 3.66248f, 7.20935f)
                lineTo(3.65662f, 7.20447f)
                lineTo(3.65466f, 7.20154f)
                curveTo(3.64687f, 7.193f, 3.64037f, 7.18342f, 3.63318f, 7.17419f)
                curveTo(3.62199f, 7.15989f, 3.61119f, 7.14561f, 3.60193f, 7.13025f)
                curveTo(3.60052f, 7.12792f, 3.59842f, 7.12578f, 3.59705f, 7.12341f)
                curveTo(3.59397f, 7.11809f, 3.59206f, 7.11221f, 3.58923f, 7.10681f)
                curveTo(3.58066f, 7.09047f, 3.57227f, 7.07417f, 3.5658f, 7.05701f)
                curveTo(3.56081f, 7.04378f, 3.55677f, 7.03042f, 3.5531f, 7.01697f)
                curveTo(3.55185f, 7.01239f, 3.5503f, 7.00791f, 3.54919f, 7.0033f)
                lineTo(3.53943f, 6.95447f)
                curveTo(3.53879f, 6.94929f, 3.53891f, 6.94403f, 3.53845f, 6.93884f)
                curveTo(3.53125f, 6.86033f, 3.5442f, 6.77964f, 3.57947f, 6.70544f)
                lineTo(3.62341f, 6.6322f)
                curveTo(3.62899f, 6.62459f, 3.63589f, 6.618f, 3.64197f, 6.61072f)
                curveTo(3.6553f, 6.59473f, 3.66892f, 6.57948f, 3.68396f, 6.5658f)
                curveTo(3.68925f, 6.56099f, 3.695f, 6.55671f, 3.70056f, 6.55212f)
                curveTo(3.71598f, 6.53939f, 3.73167f, 6.52739f, 3.74841f, 6.51697f)
                curveTo(3.75284f, 6.5142f, 3.75753f, 6.51081f, 3.76208f, 6.50818f)
                lineTo(10.4213f, 2.66248f)
                curveTo(10.149f, 2.49766f, 9.86075f, 2.3572f, 9.56091f, 2.23962f)
                lineTo(1.91248f, 6.65564f)
                close()
                moveTo(4.81482f, 6.93787f)
                lineTo(8.18005f, 9.34314f)
                lineTo(8.80603f, 8.98279f)
                lineTo(5.50916f, 6.53748f)
                lineTo(4.81482f, 6.93787f)
                close()
                moveTo(6.35779f, 6.04724f)
                lineTo(9.65564f, 8.49158f)
                lineTo(10.2738f, 8.13416f)
                lineTo(6.97693f, 5.68884f)
                lineTo(6.35779f, 6.04724f)
                close()
                moveTo(7.50037f, 1.84998f)
                curveTo(5.11309f, 1.84998f, 3.07211f, 3.33108f, 2.24451f, 5.42419f)
                lineTo(8.32947f, 1.9115f)
                curveTo(8.05882f, 1.87167f, 7.78208f, 1.84999f, 7.50037f, 1.84998f)
                close()
            }
        }.build()
        
        return _StitchesLogo!!
    }

private var _StitchesLogo: ImageVector? = null

