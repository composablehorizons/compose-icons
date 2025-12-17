package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Eject: ImageVector
    get() {
        if (_Eject != null) return _Eject!!
        
        _Eject = ImageVector.Builder(
            name = "eject",
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
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(7f, -12f)
                lineTo(5.33f, 15f)
                horizontalLineToRelative(13.34f)
                lineTo(12f, 5f)
                close()
                moveToRelative(0f, 3.6f)
                lineToRelative(2.93f, 4.4f)
                horizontalLineTo(9.07f)
                lineTo(12f, 8.6f)
                close()
            }
        }.build()
        
        return _Eject!!
    }

private var _Eject: ImageVector? = null

