package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Leak_remove: ImageVector
    get() {
        if (_Leak_remove != null) return _Leak_remove!!
        
        _Leak_remove = ImageVector.Builder(
            name = "leak_remove",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                curveToRelative(0f, 0.37f, -0.04f, 0.72f, -0.12f, 1.06f)
                lineToRelative(1.59f, 1.59f)
                curveTo(9.81f, 4.84f, 10f, 3.94f, 10f, 3f)
                close()
                moveTo(3f, 4.27f)
                lineToRelative(2.84f, 2.84f)
                curveTo(5.03f, 7.67f, 4.06f, 8f, 3f, 8f)
                verticalLineToRelative(2f)
                curveToRelative(1.61f, 0f, 3.09f, -0.55f, 4.27f, -1.46f)
                lineTo(8.7f, 9.97f)
                curveTo(7.14f, 11.24f, 5.16f, 12f, 3f, 12f)
                verticalLineToRelative(2f)
                curveToRelative(2.71f, 0f, 5.19f, -0.99f, 7.11f, -2.62f)
                lineToRelative(2.5f, 2.5f)
                curveTo(10.99f, 15.81f, 10f, 18.29f, 10f, 21f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.69f)
                lineToRelative(1.43f, 1.43f)
                curveTo(14.55f, 17.91f, 14f, 19.39f, 14f, 21f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f)
                lineTo(19.73f, 21f)
                lineTo(21f, 19.73f)
                lineTo(4.27f, 3f)
                lineTo(3f, 4.27f)
                close()
                moveTo(14f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.5f, -0.37f, 2.91f, -1.02f, 4.16f)
                lineToRelative(1.46f, 1.46f)
                curveTo(13.42f, 6.98f, 14f, 5.06f, 14f, 3f)
                close()
                moveToRelative(5.94f, 13.12f)
                curveToRelative(0.34f, -0.08f, 0.69f, -0.12f, 1.06f, -0.12f)
                verticalLineToRelative(-2f)
                curveToRelative(-0.94f, 0f, -1.84f, 0.19f, -2.66f, 0.52f)
                lineToRelative(1.6f, 1.6f)
                close()
                moveToRelative(-4.56f, -4.56f)
                lineToRelative(1.46f, 1.46f)
                curveTo(18.09f, 12.37f, 19.5f, 12f, 21f, 12f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.06f, 0f, -3.98f, 0.58f, -5.62f, 1.56f)
                close()
            }
        }.build()
        
        return _Leak_remove!!
    }

private var _Leak_remove: ImageVector? = null

