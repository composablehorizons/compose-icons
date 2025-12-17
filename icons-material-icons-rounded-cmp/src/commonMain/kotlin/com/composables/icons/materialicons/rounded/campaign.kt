package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Campaign: ImageVector
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
                moveTo(18f, 12f)
                lineTo(18f, 12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveTo(18.45f, 11f, 18f, 11.45f, 18f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.59f, 16.82f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.05f, 0.2f, 1.37f)
                curveToRelative(0.53f, 0.39f, 1.09f, 0.81f, 1.62f, 1.21f)
                curveToRelative(0.44f, 0.33f, 1.06f, 0.24f, 1.38f, -0.2f)
                curveToRelative(0f, -0.01f, 0.01f, -0.01f, 0.01f, -0.02f)
                curveToRelative(0.33f, -0.44f, 0.24f, -1.06f, -0.2f, -1.38f)
                curveToRelative(-0.53f, -0.4f, -1.09f, -0.82f, -1.61f, -1.21f)
                curveToRelative(-0.44f, -0.33f, -1.06f, -0.23f, -1.39f, 0.21f)
                curveTo(16.6f, 16.81f, 16.59f, 16.82f, 16.59f, 16.82f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.81f, 4.81f)
                curveToRelative(0f, -0.01f, -0.01f, -0.01f, -0.01f, -0.02f)
                curveToRelative(-0.33f, -0.44f, -0.95f, -0.53f, -1.38f, -0.2f)
                curveToRelative(-0.53f, 0.4f, -1.1f, 0.82f, -1.62f, 1.22f)
                curveToRelative(-0.44f, 0.33f, -0.52f, 0.95f, -0.19f, 1.38f)
                curveToRelative(0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.02f)
                curveToRelative(0.33f, 0.44f, 0.94f, 0.53f, 1.38f, 0.2f)
                curveToRelative(0.53f, -0.39f, 1.09f, -0.82f, 1.62f, -1.22f)
                curveTo(20.05f, 5.87f, 20.13f, 5.25f, 19.81f, 4.81f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                lineToRelative(5f, 3f)
                verticalLineTo(6f)
                lineTo(8f, 9f)
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
        }.build()
        
        return _Campaign!!
    }

private var _Campaign: ImageVector? = null

