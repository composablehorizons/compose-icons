package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Push_pin: ImageVector
    get() {
        if (_Push_pin != null) return _Push_pin!!
        
        _Push_pin = ImageVector.Builder(
            name = "push_pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 12f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(6f)
                lineToRelative(-1f, 1f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                lineToRelative(2f, -2f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-7.15f, 2f)
                horizontalLineToRelative(6.3f)
                lineTo(14f, 12.85f)
                verticalLineTo(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(7.85f)
                close()
                moveTo(12f, 14f)
                close()
            }
        }.build()
        
        return _Push_pin!!
    }

private var _Push_pin: ImageVector? = null

