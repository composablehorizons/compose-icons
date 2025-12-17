package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Zoom_out_map: ImageVector
    get() {
        if (_Zoom_out_map != null) return _Zoom_out_map!!
        
        _Zoom_out_map = ImageVector.Builder(
            name = "zoom_out_map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(104f)
                lineToRelative(124f, -124f)
                lineToRelative(56f, 56f)
                lineToRelative(-124f, 124f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(104f)
                lineTo(580f, 636f)
                lineToRelative(56f, -56f)
                lineToRelative(124f, 124f)
                verticalLineToRelative(-104f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                close()
                moveTo(324f, 380f)
                lineTo(200f, 256f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(256f)
                lineToRelative(124f, 124f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(312f, 0f)
                lineToRelative(-56f, -56f)
                lineToRelative(124f, -124f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(636f, 380f)
                close()
            }
        }.build()
        
        return _Zoom_out_map!!
    }

private var _Zoom_out_map: ImageVector? = null

