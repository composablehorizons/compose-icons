package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Museum: ImageVector
    get() {
        if (_Museum != null) return _Museum!!
        
        _Museum = ImageVector.Builder(
            name = "museum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                lineToRelative(400f, -280f)
                lineToRelative(400f, 280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                lineToRelative(80f, 120f)
                lineToRelative(80f, -120f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(-80f)
                lineToRelative(-80f, 120f)
                lineToRelative(-80f, -120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Museum!!
    }

private var _Museum: ImageVector? = null

