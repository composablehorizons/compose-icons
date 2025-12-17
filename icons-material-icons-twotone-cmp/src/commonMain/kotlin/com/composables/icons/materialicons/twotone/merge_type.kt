package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Merge_type: ImageVector
    get() {
        if (_Merge_type != null) return _Merge_type!!
        
        _Merge_type = ImageVector.Builder(
            name = "merge_type",
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
                moveTo(5.59f, 19f)
                lineTo(7f, 20.41f)
                lineToRelative(6f, -6f)
                verticalLineTo(8f)
                horizontalLineToRelative(3.5f)
                lineTo(12f, 3.5f)
                lineTo(7.5f, 8f)
                horizontalLineTo(11f)
                verticalLineToRelative(5.59f)
                close()
                moveToRelative(11.407f, 1.41f)
                lineToRelative(-3.408f, -3.407f)
                lineToRelative(1.4f, -1.407f)
                lineToRelative(3.41f, 3.408f)
                close()
            }
        }.build()
        
        return _Merge_type!!
    }

private var _Merge_type: ImageVector? = null

