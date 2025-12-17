package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Format_line_spacing: ImageVector
    get() {
        if (_Format_line_spacing != null) return _Format_line_spacing!!
        
        _Format_line_spacing = ImageVector.Builder(
            name = "format_line_spacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                lineTo(80f, 640f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 62f)
                verticalLineToRelative(-332f)
                lineToRelative(-64f, 62f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -62f)
                verticalLineToRelative(332f)
                lineToRelative(64f, -62f)
                lineToRelative(56f, 56f)
                lineToRelative(-160f, 160f)
                close()
                moveToRelative(240f, -40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _Format_line_spacing!!
    }

private var _Format_line_spacing: ImageVector? = null

