package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Merge_type: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 20.41f)
                lineTo(18.41f, 19f)
                lineTo(15f, 15.59f)
                lineTo(13.59f, 17f)
                lineTo(17f, 20.41f)
                close()
                moveTo(7.5f, 8f)
                horizontalLineTo(11f)
                verticalLineToRelative(5.59f)
                lineTo(5.59f, 19f)
                lineTo(7f, 20.41f)
                lineToRelative(6f, -6f)
                verticalLineTo(8f)
                horizontalLineToRelative(3.5f)
                lineTo(12f, 3.5f)
                lineTo(7.5f, 8f)
                close()
            }
        }.build()
        
        return _Merge_type!!
    }

private var _Merge_type: ImageVector? = null

