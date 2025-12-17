package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wb_iridescent: ImageVector
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
                moveTo(5f, 15f)
                horizontalLineToRelative(14f)
                verticalLineTo(9.05f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                close()
                moveToRelative(6f, -14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(8.04f, 2.6f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.8f, -1.79f)
                lineToRelative(-1.42f, -1.41f)
                close()
                moveTo(13f, 23f)
                verticalLineToRelative(-2.95f)
                horizontalLineToRelative(-2f)
                verticalLineTo(23f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(7.45f, -3.91f)
                lineToRelative(-1.8f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.42f, -1.42f)
                close()
                moveTo(3.55f, 5.01f)
                lineTo(5.34f, 6.8f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.96f, 3.6f)
                lineTo(3.55f, 5.01f)
                close()
                moveTo(4.96f, 20.5f)
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

