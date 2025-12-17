package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RootFolderOpened: ImageVector
    get() {
        if (_RootFolderOpened != null) return _RootFolderOpened!!
        
        _RootFolderOpened = ImageVector.Builder(
            name = "root-folder-opened",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.9579f, 6.04035f)
                curveTo(12.7426f, 4.87867f, 11.7238f, 4f, 10.5f, 4f)
                horizontalLineTo(7.20702f)
                lineTo(5.64602f, 2.439f)
                curveTo(5.36502f, 2.158f, 4.98302f, 2f, 4.58502f, 2f)
                horizontalLineTo(3.49902f)
                curveTo(2.11802f, 2f, 0.999023f, 3.119f, 0.999023f, 4.5f)
                verticalLineTo(7.261f)
                curveTo(1.30602f, 7.007f, 1.64202f, 6.79f, 1.99902f, 6.607f)
                verticalLineTo(4.5f)
                curveTo(1.99902f, 3.672f, 2.67102f, 3f, 3.49902f, 3f)
                horizontalLineTo(4.58502f)
                curveTo(4.71802f, 3f, 4.84502f, 3.053f, 4.93902f, 3.146f)
                lineTo(6.64602f, 4.853f)
                curveTo(6.74002f, 4.947f, 6.86702f, 4.999f, 7.00002f, 4.999f)
                horizontalLineTo(10.5f)
                curveTo(11.153f, 4.999f, 11.709f, 5.416f, 11.915f, 5.999f)
                horizontalLineTo(5.52202f)
                curveTo(5.44599f, 5.999f, 5.37323f, 6.01206f, 5.30034f, 6.02515f)
                curveTo(5.25915f, 6.03254f, 5.21791f, 6.03994f, 5.17602f, 6.045f)
                curveTo(6.08902f, 6.158f, 6.93302f, 6.494f, 7.65202f, 6.999f)
                horizontalLineTo(12.496f)
                curveTo(13.651f, 6.999f, 14.372f, 8.249f, 13.795f, 9.249f)
                lineTo(12.21f, 11.994f)
                curveTo(11.853f, 12.613f, 11.192f, 12.994f, 10.478f, 12.994f)
                horizontalLineTo(9.78702f)
                curveTo(9.68802f, 13.343f, 9.55602f, 13.677f, 9.39402f, 13.994f)
                horizontalLineTo(10.477f)
                curveTo(11.549f, 13.994f, 12.539f, 13.422f, 13.075f, 12.494f)
                lineTo(14.66f, 9.749f)
                curveTo(15.5427f, 8.22058f, 14.6037f, 6.34143f, 12.9579f, 6.04035f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 14f)
                curveTo(5.881f, 14f, 7f, 12.881f, 7f, 11.5f)
                curveTo(7f, 10.119f, 5.881f, 9f, 4.5f, 9f)
                curveTo(3.119f, 9f, 2f, 10.119f, 2f, 11.5f)
                curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 11.5f)
                curveTo(0f, 9.019f, 2.019f, 7f, 4.5f, 7f)
                curveTo(6.981f, 7f, 9f, 9.019f, 9f, 11.5f)
                curveTo(9f, 13.981f, 6.981f, 16f, 4.5f, 16f)
                curveTo(2.019f, 16f, 0f, 13.981f, 0f, 11.5f)
                close()
                moveTo(1f, 11.5f)
                curveTo(1f, 13.43f, 2.57f, 15f, 4.5f, 15f)
                curveTo(6.43f, 15f, 8f, 13.43f, 8f, 11.5f)
                curveTo(8f, 9.57f, 6.43f, 8f, 4.5f, 8f)
                curveTo(2.57f, 8f, 1f, 9.57f, 1f, 11.5f)
                close()
            }
        }.build()
        
        return _RootFolderOpened!!
    }

private var _RootFolderOpened: ImageVector? = null

