package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Add_to_drive: ImageVector
    get() {
        if (_Add_to_drive != null) return _Add_to_drive!!
        
        _Add_to_drive = ImageVector.Builder(
            name = "add_to_drive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(20f)
                close()
                moveTo(15.03f, 21.5f)
                horizontalLineTo(5.66f)
                curveToRelative(-0.72f, 0f, -1.38f, -0.38f, -1.73f, -1f)
                lineTo(1.57f, 16.4f)
                curveToRelative(-0.36f, -0.62f, -0.35f, -1.38f, 0.01f, -2f)
                lineTo(7.92f, 3.49f)
                curveTo(8.28f, 2.88f, 8.94f, 2.5f, 9.65f, 2.5f)
                horizontalLineToRelative(4.7f)
                curveToRelative(0.71f, 0f, 1.37f, 0.38f, 1.73f, 0.99f)
                lineToRelative(4.48f, 7.71f)
                curveTo(20.06f, 11.07f, 19.54f, 11f, 19f, 11f)
                curveToRelative(-0.28f, 0f, -0.56f, 0.02f, -0.84f, 0.06f)
                lineTo(14.35f, 4.5f)
                horizontalLineToRelative(-4.7f)
                lineTo(3.31f, 15.41f)
                lineToRelative(2.35f, 4.09f)
                horizontalLineToRelative(7.89f)
                curveTo(13.9f, 20.27f, 14.4f, 20.95f, 15.03f, 21.5f)
                close()
                moveTo(13.34f, 15f)
                curveTo(13.12f, 15.63f, 13f, 16.3f, 13f, 17f)
                horizontalLineTo(7.25f)
                lineToRelative(-0.73f, -1.27f)
                lineToRelative(4.58f, -7.98f)
                horizontalLineToRelative(1.8f)
                lineToRelative(2.53f, 4.42f)
                curveToRelative(-0.56f, 0.42f, -1.05f, 0.93f, -1.44f, 1.51f)
                lineToRelative(-2f, -3.49f)
                lineTo(9.25f, 15f)
                horizontalLineTo(13.34f)
                close()
            }
        }.build()
        
        return _Add_to_drive!!
    }

private var _Add_to_drive: ImageVector? = null

