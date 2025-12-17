package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Full_coverage: ImageVector
    get() {
        if (_Full_coverage != null) return _Full_coverage!!
        
        _Full_coverage = ImageVector.Builder(
            name = "full_coverage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, -160f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(560f)
                horizontalLineTo(240f)
                close()
                moveToRelative(160f, -200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-200f)
                horizontalLineTo(400f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Full_coverage!!
    }

private var _Full_coverage: ImageVector? = null

