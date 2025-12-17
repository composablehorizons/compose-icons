package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Stop_screen_share: ImageVector
    get() {
        if (_Stop_screen_share != null) return _Stop_screen_share!!
        
        _Stop_screen_share = ImageVector.Builder(
            name = "stop_screen_share",
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
                moveTo(21.22f, 18.02f)
                lineToRelative(2f, 2f)
                horizontalLineTo(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.78f)
                close()
                moveToRelative(0.77f, -2f)
                lineToRelative(0.01f, -10f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(7.22f)
                lineToRelative(5.23f, 5.23f)
                curveToRelative(0.18f, -0.04f, 0.36f, -0.07f, 0.55f, -0.1f)
                verticalLineTo(7.02f)
                lineToRelative(4f, 3.73f)
                lineToRelative(-1.58f, 1.47f)
                lineToRelative(5.54f, 5.54f)
                curveToRelative(0.61f, -0.33f, 1.03f, -0.99f, 1.03f, -1.74f)
                close()
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineToRelative(1.54f, 1.54f)
                curveToRelative(-0.4f, 0.36f, -0.65f, 0.89f, -0.65f, 1.48f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18.13f)
                lineToRelative(2.71f, 2.71f)
                lineToRelative(1.27f, -1.27f)
                lineTo(2.39f, 1.73f)
                close()
                moveTo(7f, 15.02f)
                curveToRelative(0.31f, -1.48f, 0.92f, -2.95f, 2.07f, -4.06f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(-1.54f, 0.38f, -2.7f, 1.18f, -3.66f, 2.47f)
                close()
            }
        }.build()
        
        return _Stop_screen_share!!
    }

private var _Stop_screen_share: ImageVector? = null

