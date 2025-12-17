package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Campaign: ImageVector
    get() {
        if (_Campaign != null) return _Campaign!!
        
        _Campaign = ImageVector.Builder(
            name = "campaign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 11f)
                curveToRelative(0f, 0.67f, 0f, 1.33f, 0f, 2f)
                curveToRelative(1.2f, 0f, 2.76f, 0f, 4f, 0f)
                curveToRelative(0f, -0.67f, 0f, -1.33f, 0f, -2f)
                curveTo(20.76f, 11f, 19.2f, 11f, 18f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 17.61f)
                curveToRelative(0.96f, 0.71f, 2.21f, 1.65f, 3.2f, 2.39f)
                curveToRelative(0.4f, -0.53f, 0.8f, -1.07f, 1.2f, -1.6f)
                curveToRelative(-0.99f, -0.74f, -2.24f, -1.68f, -3.2f, -2.4f)
                curveTo(16.8f, 16.54f, 16.4f, 17.08f, 16f, 17.61f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.4f, 5.6f)
                curveTo(20f, 5.07f, 19.6f, 4.53f, 19.2f, 4f)
                curveToRelative(-0.99f, 0.74f, -2.24f, 1.68f, -3.2f, 2.4f)
                curveToRelative(0.4f, 0.53f, 0.8f, 1.07f, 1.2f, 1.6f)
                curveTo(18.16f, 7.28f, 19.41f, 6.35f, 20.4f, 5.6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                lineToRelative(5f, 3f)
                verticalLineTo(6f)
                lineTo(8f, 9f)
                horizontalLineTo(4f)
                close()
                moveTo(9.03f, 10.71f)
                lineTo(11f, 9.53f)
                verticalLineToRelative(4.94f)
                lineToRelative(-1.97f, -1.18f)
                lineTo(8.55f, 13f)
                horizontalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                horizontalLineToRelative(0.55f)
                lineTo(9.03f, 10.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 12f)
                curveToRelative(0f, -1.33f, -0.58f, -2.53f, -1.5f, -3.35f)
                verticalLineToRelative(6.69f)
                curveTo(14.92f, 14.53f, 15.5f, 13.33f, 15.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.03f, 10.71f)
                lineTo(11f, 9.53f)
                verticalLineToRelative(4.94f)
                lineToRelative(-1.97f, -1.18f)
                lineTo(8.55f, 13f)
                horizontalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                horizontalLineToRelative(0.55f)
                lineTo(9.03f, 10.71f)
                close()
            }
        }.build()
        
        return _Campaign!!
    }

private var _Campaign: ImageVector? = null

