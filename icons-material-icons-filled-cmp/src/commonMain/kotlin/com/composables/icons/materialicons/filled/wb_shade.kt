package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Wb_shade: ImageVector
    get() {
        if (_Wb_shade != null) return _Wb_shade!!
        
        _Wb_shade = ImageVector.Builder(
            name = "wb_shade",
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
                moveTo(14f, 12f)
                verticalLineToRelative(2.5f)
                lineToRelative(5.5f, 5.5f)
                horizontalLineTo(22f)
                close()
                moveToRelative(0f, 8f)
                horizontalLineToRelative(3f)
                lineToRelative(-3f, -3f)
                close()
                moveTo(8f, 4f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(8f)
                verticalLineTo(10f)
                horizontalLineToRelative(2f)
                lineTo(8f, 4f)
                close()
                moveToRelative(1f, 10f)
                horizontalLineTo(7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Wb_shade!!
    }

private var _Wb_shade: ImageVector? = null

