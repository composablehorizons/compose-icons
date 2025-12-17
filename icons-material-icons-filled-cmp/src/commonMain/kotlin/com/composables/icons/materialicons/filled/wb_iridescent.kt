package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Wb_iridescent: ImageVector
    get() {
        if (_Wb_iridescent != null) return _Wb_iridescent!!
        
        _Wb_iridescent = ImageVector.Builder(
            name = "wb_iridescent",
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
                moveTo(5f, 14.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-6f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                close()
                moveTo(11f, 0.55f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(2f)
                verticalLineTo(0.55f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(8.04f, 2.5f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.8f, -1.79f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(13f, 22.45f)
                verticalLineTo(19.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.95f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(7.45f, -3.91f)
                lineToRelative(-1.8f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.42f, -1.42f)
                close()
                moveTo(3.55f, 4.46f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveToRelative(1.41f, 15.49f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.42f)
                close()
            }
        }.build()
        
        return _Wb_iridescent!!
    }

private var _Wb_iridescent: ImageVector? = null

