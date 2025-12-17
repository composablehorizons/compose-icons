package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Class: ImageVector
    get() {
        if (_Class != null) return _Class!!
        
        _Class = ImageVector.Builder(
            name = "class",
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
                moveTo(13f, 13f)
                lineToRelative(-3f, -2.25f)
                lineTo(7f, 13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(12f)
                verticalLineTo(4f)
                horizontalLineToRelative(-5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                lineToRelative(-1f, -0.75f)
                lineTo(9f, 9f)
                verticalLineTo(4f)
                close()
                moveToRelative(9f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                lineToRelative(3f, -2.25f)
                lineTo(13f, 13f)
                verticalLineTo(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Class!!
    }

private var _Class: ImageVector? = null

