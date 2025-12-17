package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Frame_source: ImageVector
    get() {
        if (_Frame_source != null) return _Frame_source!!
        
        _Frame_source = ImageVector.Builder(
            name = "frame_source",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(344f, 624f)
                lineTo(200f, 480f)
                lineToRelative(144f, -144f)
                lineToRelative(56f, 57f)
                lineToRelative(-87f, 87f)
                lineToRelative(87f, 87f)
                lineToRelative(-56f, 57f)
                close()
                moveToRelative(272f, 0f)
                lineToRelative(-56f, -57f)
                lineToRelative(87f, -87f)
                lineToRelative(-87f, -87f)
                lineToRelative(56f, -57f)
                lineToRelative(144f, 144f)
                lineToRelative(-144f, 144f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(600f)
                close()
                moveTo(120f, 360f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(640f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Frame_source!!
    }

private var _Frame_source: ImageVector? = null

