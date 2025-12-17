package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Checklist: ImageVector
    get() {
        if (_Checklist != null) return _Checklist!!
        
        _Checklist = ImageVector.Builder(
            name = "checklist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(222f, 760f)
                lineTo(80f, 618f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineToRelative(-225f, 226f)
                close()
                moveToRelative(0f, -320f)
                lineTo(80f, 298f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineToRelative(-225f, 226f)
                close()
                moveToRelative(298f, 240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                close()
            }
        }.build()
        
        return _Checklist!!
    }

private var _Checklist: ImageVector? = null

