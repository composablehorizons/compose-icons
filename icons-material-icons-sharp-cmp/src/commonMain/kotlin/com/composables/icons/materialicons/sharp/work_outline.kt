package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Work_outline: ImageVector
    get() {
        if (_Work_outline != null) return _Work_outline!!
        
        _Work_outline = ImageVector.Builder(
            name = "work_outline",
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
                moveTo(14f, 6f)
                verticalLineTo(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(4f, 8f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                close()
                moveToRelative(18f, -2f)
                verticalLineToRelative(15f)
                horizontalLineTo(2.01f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Work_outline!!
    }

private var _Work_outline: ImageVector? = null

