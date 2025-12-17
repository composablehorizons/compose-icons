package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BatteryVerticalCharging2: ImageVector
    get() {
        if (_BatteryVerticalCharging2 != null) return _BatteryVerticalCharging2!!
        
        _BatteryVerticalCharging2 = ImageVector.Builder(
            name = "battery-vertical-charging-2",
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
                moveTo(7f, 18f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
                verticalLineToRelative(1f)
                moveToRelative(-10f, 10f)
                curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 21f)
                verticalLineToRelative(-3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 14f)
                verticalLineToRelative(-2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 14f)
                verticalLineToRelative(-2.5f)
            }
        }.build()
        
        return _BatteryVerticalCharging2!!
    }

private var _BatteryVerticalCharging2: ImageVector? = null

