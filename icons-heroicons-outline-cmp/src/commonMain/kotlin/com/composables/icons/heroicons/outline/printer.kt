package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Printer: ImageVector
    get() {
        if (_Printer != null) return _Printer!!
        
        _Printer = ImageVector.Builder(
            name = "printer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6.72f, 13.829f)
                curveToRelative(-0.24f, 0.03f, -0.48f, 0.062f, -0.72f, 0.096f)
                moveToRelative(0.72f, -0.096f)
                arcToRelative(42.415f, 42.415f, 0f, false, true, 10.56f, 0f)
                moveToRelative(-10.56f, 0f)
                lineTo(6.34f, 18f)
                moveToRelative(10.94f, -4.171f)
                curveToRelative(0.24f, 0.03f, 0.48f, 0.062f, 0.72f, 0.096f)
                moveToRelative(-0.72f, -0.096f)
                lineTo(17.66f, 18f)
                moveToRelative(0f, 0f)
                lineToRelative(0.229f, 2.523f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.12f, 1.227f)
                horizontalLineTo(7.231f)
                curveToRelative(-0.662f, 0f, -1.18f, -0.568f, -1.12f, -1.227f)
                lineTo(6.34f, 18f)
                moveToRelative(11.318f, 0f)
                horizontalLineToRelative(1.091f)
                arcTo(2.25f, 2.25f, 0f, false, false, 21f, 15.75f)
                verticalLineTo(9.456f)
                curveToRelative(0f, -1.081f, -0.768f, -2.015f, -1.837f, -2.175f)
                arcToRelative(48.055f, 48.055f, 0f, false, false, -1.913f, -0.247f)
                moveTo(6.34f, 18f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 15.75f)
                verticalLineTo(9.456f)
                curveToRelative(0f, -1.081f, 0.768f, -2.015f, 1.837f, -2.175f)
                arcToRelative(48.041f, 48.041f, 0f, false, true, 1.913f, -0.247f)
                moveToRelative(10.5f, 0f)
                arcToRelative(48.536f, 48.536f, 0f, false, false, -10.5f, 0f)
                moveToRelative(10.5f, 0f)
                verticalLineTo(3.375f)
                curveToRelative(0f, -0.621f, -0.504f, -1.125f, -1.125f, -1.125f)
                horizontalLineToRelative(-8.25f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(3.659f)
                moveTo(18f, 10.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(18f)
                verticalLineTo(10.5f)
                close()
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(15f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _Printer!!
    }

private var _Printer: ImageVector? = null

