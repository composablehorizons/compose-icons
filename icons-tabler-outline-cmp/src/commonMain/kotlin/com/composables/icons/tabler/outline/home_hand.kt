package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HomeHand: ImageVector
    get() {
        if (_HomeHand != null) return _HomeHand!!
        
        _HomeHand = ImageVector.Builder(
            name = "home-hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 9f)
                lineToRelative(-6f, -6f)
                lineToRelative(-9f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(3.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 21f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17.5f)
                lineToRelative(-0.585f, -0.578f)
                arcToRelative(1.516f, 1.516f, 0f, false, false, -2f, 0f)
                curveToRelative(-0.477f, 0.433f, -0.551f, 1.112f, -0.177f, 1.622f)
                lineToRelative(1.762f, 2.456f)
                curveToRelative(0.37f, 0.506f, 1.331f, 1f, 2f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.009f, 0f, 1.497f, -0.683f, 1.622f, -1.593f)
                curveToRelative(0.252f, -0.938f, 0.378f, -1.74f, 0.378f, -2.407f)
                curveToRelative(0f, -1f, -0.939f, -1.843f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2.636f)
                curveToRelative(0f, -0.754f, -0.672f, -1.364f, -1.5f, -1.364f)
                reflectiveCurveToRelative(-1.5f, 0.61f, -1.5f, 1.364f)
                verticalLineToRelative(4.136f)
                close()
            }
        }.build()
        
        return _HomeHand!!
    }

private var _HomeHand: ImageVector? = null

