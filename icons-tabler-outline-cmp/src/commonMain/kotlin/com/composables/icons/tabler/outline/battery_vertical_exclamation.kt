package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BatteryVerticalExclamation: ImageVector
    get() {
        if (_BatteryVerticalExclamation != null) return _BatteryVerticalExclamation!!
        
        _BatteryVerticalExclamation = ImageVector.Builder(
            name = "battery-vertical-exclamation",
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
                moveTo(17f, 12f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
                horizontalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()
        
        return _BatteryVerticalExclamation!!
    }

private var _BatteryVerticalExclamation: ImageVector? = null

