package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Work_off: ImageVector
    get() {
        if (_Work_off != null) return _Work_off!!
        
        _Work_off = ImageVector.Builder(
            name = "work_off",
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
                moveTo(10f, 4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.6f)
                lineTo(22f, 17.6f)
                verticalLineTo(6f)
                horizontalLineToRelative(-6f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.98f, 0f, -1.79f, 0.71f, -1.96f, 1.64f)
                lineTo(10f, 5.6f)
                verticalLineTo(4f)
                close()
                moveTo(3.4f, 1.84f)
                lineTo(1.99f, 3.25f)
                lineTo(4.74f, 6f)
                horizontalLineTo(2.01f)
                lineTo(2f, 21f)
                horizontalLineToRelative(17.74f)
                lineToRelative(2f, 2f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Work_off!!
    }

private var _Work_off: ImageVector? = null

