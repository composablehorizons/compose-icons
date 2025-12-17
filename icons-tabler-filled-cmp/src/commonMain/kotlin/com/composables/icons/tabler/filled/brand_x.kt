package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BrandX: ImageVector
    get() {
        if (_BrandX != null) return _BrandX!!
        
        _BrandX = ImageVector.Builder(
            name = "brand-x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.267f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, 0.73f, 0.317f)
                lineToRelative(0.076f, 0.092f)
                lineToRelative(4.274f, 5.828f)
                lineToRelative(5.946f, -5.944f)
                arcToRelative(1f, 1f, 0f, false, true, 1.497f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-6.163f, 6.162f)
                lineToRelative(6.262f, 8.54f)
                arcToRelative(1f, 1f, 0f, false, true, -0.697f, 1.585f)
                lineToRelative(-0.109f, 0.006f)
                horizontalLineToRelative(-4.267f)
                arcToRelative(1f, 1f, 0f, false, true, -0.73f, -0.317f)
                lineToRelative(-0.076f, -0.092f)
                lineToRelative(-4.276f, -5.829f)
                lineToRelative(-5.944f, 5.945f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(6.161f, -6.163f)
                lineToRelative(-6.26f, -8.539f)
                arcToRelative(1f, 1f, 0f, false, true, 0.697f, -1.585f)
                lineToRelative(0.109f, -0.006f)
                horizontalLineToRelative(4.267f)
                close()
            }
        }.build()
        
        return _BrandX!!
    }

private var _BrandX: ImageVector? = null

