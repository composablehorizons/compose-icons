package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BusinessTime: ImageVector
    get() {
        if (_BusinessTime != null) return _BusinessTime!!
        
        _BusinessTime = ImageVector.Builder(
            name = "business-time",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 224f)
                curveToRelative(-79.59f, 0f, -144f, 64.41f, -144f, 144f)
                reflectiveCurveToRelative(64.41f, 144f, 144f, 144f)
                reflectiveCurveToRelative(144f, -64.41f, 144f, -144f)
                reflectiveCurveToRelative(-64.41f, -144f, -144f, -144f)
                close()
                moveToRelative(64f, 150.29f)
                curveToRelative(0f, 5.34f, -4.37f, 9.71f, -9.71f, 9.71f)
                horizontalLineToRelative(-60.57f)
                curveToRelative(-5.34f, 0f, -9.71f, -4.37f, -9.71f, -9.71f)
                verticalLineToRelative(-76.57f)
                curveToRelative(0f, -5.34f, 4.37f, -9.71f, 9.71f, -9.71f)
                horizontalLineToRelative(12.57f)
                curveToRelative(5.34f, 0f, 9.71f, 4.37f, 9.71f, 9.71f)
                verticalLineTo(352f)
                horizontalLineToRelative(38.29f)
                curveToRelative(5.34f, 0f, 9.71f, 4.37f, 9.71f, 9.71f)
                verticalLineToRelative(12.58f)
                close()
                moveTo(496f, 192f)
                curveToRelative(5.4f, 0f, 10.72f, 0.33f, 16f, 0.81f)
                verticalLineTo(144f)
                curveToRelative(0f, -25.6f, -22.4f, -48f, -48f, -48f)
                horizontalLineToRelative(-80f)
                verticalLineTo(48f)
                curveToRelative(0f, -25.6f, -22.4f, -48f, -48f, -48f)
                horizontalLineTo(176f)
                curveToRelative(-25.6f, 0f, -48f, 22.4f, -48f, 48f)
                verticalLineToRelative(48f)
                horizontalLineTo(48f)
                curveToRelative(-25.6f, 0f, -48f, 22.4f, -48f, 48f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(395.12f)
                curveToRelative(28.6f, -20.09f, 63.35f, -32f, 100.88f, -32f)
                close()
                moveTo(320f, 96f)
                horizontalLineTo(192f)
                verticalLineTo(64f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(6.82f, 224f)
                horizontalLineTo(208f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineTo(0f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 25.6f, 22.4f, 48f, 48f, 48f)
                horizontalLineToRelative(291.43f)
                curveTo(327.1f, 423.96f, 320f, 396.82f, 320f, 368f)
                curveToRelative(0f, -16.66f, 2.48f, -32.72f, 6.82f, -48f)
                close()
            }
        }.build()
        
        return _BusinessTime!!
    }

private var _BusinessTime: ImageVector? = null

