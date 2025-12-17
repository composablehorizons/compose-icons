package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BatteryVerticalEco: ImageVector
    get() {
        if (_BatteryVerticalEco != null) return _BatteryVerticalEco!!
        
        _BatteryVerticalEco = ImageVector.Builder(
            name = "battery-vertical-eco",
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
                moveToRelative(-8f, 12f)
                curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 17.143f)
                curveToRelative(0f, -2.84f, 2.09f, -5.143f, 4.667f, -5.143f)
                horizontalLineToRelative(2.333f)
                verticalLineToRelative(0.857f)
                curveToRelative(0f, 2.84f, -2.09f, 5.143f, -4.667f, 5.143f)
                horizontalLineToRelative(-2.333f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 21f)
                verticalLineToRelative(-3f)
            }
        }.build()
        
        return _BatteryVerticalEco!!
    }

private var _BatteryVerticalEco: ImageVector? = null

