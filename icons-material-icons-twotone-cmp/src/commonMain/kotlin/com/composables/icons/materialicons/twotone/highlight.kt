package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Highlight: ImageVector
    get() {
        if (_Highlight != null) return _Highlight!!
        
        _Highlight = ImageVector.Builder(
            name = "highlight",
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
                moveTo(11f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.83f)
                lineToRelative(3f, -3f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineToRelative(2.17f)
                lineToRelative(3f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 14f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-5f)
                lineToRelative(3f, -3f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(2f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2.17f)
                lineToRelative(-3f, 3f)
                verticalLineTo(20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.83f)
                lineToRelative(-3f, -3f)
                verticalLineTo(11f)
                close()
                moveToRelative(3f, -9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4.916f, 4.464f)
                lineToRelative(2.12f, 2.122f)
                lineTo(5.62f, 8f)
                lineTo(3.5f, 5.877f)
                close()
                moveTo(18.372f, 8f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.415f, 1.413f)
                close()
            }
        }.build()
        
        return _Highlight!!
    }

private var _Highlight: ImageVector? = null

