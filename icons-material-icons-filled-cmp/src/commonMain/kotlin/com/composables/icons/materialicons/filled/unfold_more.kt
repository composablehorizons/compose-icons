package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Unfold_more: ImageVector
    get() {
        if (_Unfold_more != null) return _Unfold_more!!
        
        _Unfold_more = ImageVector.Builder(
            name = "unfold_more",
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
                moveTo(12f, 5.83f)
                lineTo(15.17f, 9f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12f, 3f)
                lineTo(7.41f, 7.59f)
                lineTo(8.83f, 9f)
                lineTo(12f, 5.83f)
                close()
                moveToRelative(0f, 12.34f)
                lineTo(8.83f, 15f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12f, 21f)
                lineToRelative(4.59f, -4.59f)
                lineTo(15.17f, 15f)
                lineTo(12f, 18.17f)
                close()
            }
        }.build()
        
        return _Unfold_more!!
    }

private var _Unfold_more: ImageVector? = null

