package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Cloud_upload: ImageVector
    get() {
        if (_Cloud_upload != null) return _Cloud_upload!!
        
        _Cloud_upload = ImageVector.Builder(
            name = "cloud_upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.21f, 12.04f)
                lineToRelative(-1.53f, -0.11f)
                lineToRelative(-0.3f, -1.5f)
                curveTo(16.88f, 7.86f, 14.62f, 6f, 12f, 6f)
                curveTo(9.94f, 6f, 8.08f, 7.14f, 7.12f, 8.96f)
                lineToRelative(-0.5f, 0.95f)
                lineToRelative(-1.07f, 0.11f)
                curveTo(3.53f, 10.24f, 2f, 11.95f, 2f, 14f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.55f, -1.22f, -2.86f, -2.79f, -2.96f)
                close()
                moveToRelative(-5.76f, 0.96f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(-3f)
                horizontalLineTo(8f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(-2.55f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.35f, 10.04f)
                curveTo(18.67f, 6.59f, 15.64f, 4f, 12f, 4f)
                curveTo(9.11f, 4f, 6.6f, 5.64f, 5.35f, 8.04f)
                curveTo(2.34f, 8.36f, 0f, 10.91f, 0f, 14f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(13f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f)
                close()
                moveTo(19f, 18f)
                horizontalLineTo(6f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f)
                lineToRelative(1.07f, -0.11f)
                lineToRelative(0.5f, -0.95f)
                curveTo(8.08f, 7.14f, 9.94f, 6f, 12f, 6f)
                curveToRelative(2.62f, 0f, 4.88f, 1.86f, 5.39f, 4.43f)
                lineToRelative(0.3f, 1.5f)
                lineToRelative(1.53f, 0.11f)
                curveToRelative(1.56f, 0.1f, 2.78f, 1.41f, 2.78f, 2.96f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.9f)
                verticalLineToRelative(-3f)
                horizontalLineTo(16f)
                lineToRelative(-4f, -4f)
                close()
            }
        }.build()
        
        return _Cloud_upload!!
    }

private var _Cloud_upload: ImageVector? = null

