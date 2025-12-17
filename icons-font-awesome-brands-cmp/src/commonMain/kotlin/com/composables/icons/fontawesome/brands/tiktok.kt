package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Tiktok: ImageVector
    get() {
        if (_Tiktok != null) return _Tiktok!!
        
        _Tiktok = ImageVector.Builder(
            name = "tiktok",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 209.91f)
                arcToRelative(210.06f, 210.06f, 0f, false, true, -122.77f, -39.25f)
                verticalLineTo(349.38f)
                arcTo(162.55f, 162.55f, 0f, true, true, 185f, 188.31f)
                verticalLineTo(278.2f)
                arcToRelative(74.62f, 74.62f, 0f, true, false, 52.23f, 71.18f)
                verticalLineTo(0f)
                lineToRelative(88f, 0f)
                arcToRelative(121.18f, 121.18f, 0f, false, false, 1.86f, 22.17f)
                horizontalLineToRelative(0f)
                arcTo(122.18f, 122.18f, 0f, false, false, 381f, 102.39f)
                arcToRelative(121.43f, 121.43f, 0f, false, false, 67f, 20.14f)
                close()
            }
        }.build()
        
        return _Tiktok!!
    }

private var _Tiktok: ImageVector? = null

