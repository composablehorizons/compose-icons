package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Full_coverage: ImageVector
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
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 600f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(680f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 680f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(-400f)
                horizontalLineTo(320f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(80f, -120f)
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
                moveTo(320f, 600f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Full_coverage!!
    }

private var _Full_coverage: ImageVector? = null

