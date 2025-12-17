package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CashRegister: ImageVector
    get() {
        if (_CashRegister != null) return _CashRegister!!
        
        _CashRegister = ImageVector.Builder(
            name = "cash-register",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 15f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.398f, 0f, -0.779f, 0.158f, -1.061f, 0.439f)
                curveToRelative(-0.281f, 0.281f, -0.439f, 0.663f, -0.439f, 1.061f)
                curveToRelative(0f, 0.398f, 0.158f, 0.779f, 0.439f, 1.061f)
                curveToRelative(0.281f, 0.281f, 0.663f, 0.439f, 1.061f, 0.439f)
                horizontalLineToRelative(1f)
                curveToRelative(0.398f, 0f, 0.779f, 0.158f, 1.061f, 0.439f)
                curveToRelative(0.281f, 0.281f, 0.439f, 0.663f, 0.439f, 1.061f)
                curveToRelative(0f, 0.398f, -0.158f, 0.779f, -0.439f, 1.061f)
                curveToRelative(-0.281f, 0.281f, -0.663f, 0.439f, -1.061f, 0.439f)
                horizontalLineToRelative(-2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 21f)
                verticalLineToRelative(1f)
                moveToRelative(0f, -8f)
                verticalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 21f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.53f, 0f, -1.039f, -0.211f, -1.414f, -0.586f)
                curveToRelative(-0.375f, -0.375f, -0.586f, -0.884f, -0.586f, -1.414f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -0.53f, 0.211f, -1.039f, 0.586f, -1.414f)
                curveToRelative(0.375f, -0.375f, 0.884f, -0.586f, 1.414f, -0.586f)
                horizontalLineToRelative(2f)
                moveToRelative(12f, 3.12f)
                verticalLineToRelative(-1.12f)
                curveToRelative(0f, -0.53f, -0.211f, -1.039f, -0.586f, -1.414f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                horizontalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 10f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.53f, -0.211f, -1.039f, -0.586f, -1.414f)
                curveToRelative(-0.375f, -0.375f, -0.884f, -0.586f, -1.414f, -0.586f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.53f, 0f, -1.039f, 0.211f, -1.414f, 0.586f)
                curveToRelative(-0.375f, 0.375f, -0.586f, 0.884f, -0.586f, 1.414f)
                verticalLineToRelative(6f)
                moveToRelative(8f, 0f)
                horizontalLineToRelative(-8f)
                moveToRelative(8f, 0f)
                horizontalLineToRelative(1f)
                moveToRelative(-9f, 0f)
                horizontalLineToRelative(-1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 14f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 17f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 13.99f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 17f)
                verticalLineToRelative(0.01f)
            }
        }.build()
        
        return _CashRegister!!
    }

private var _CashRegister: ImageVector? = null

