package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Score: ImageVector
    get() {
        if (_Score != null) return _Score!!
        
        _Score = ImageVector.Builder(
            name = "score",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(160f, -340f)
                lineToRelative(160f, 160f)
                lineToRelative(240f, -240f)
                verticalLineToRelative(-220f)
                horizontalLineTo(200f)
                verticalLineToRelative(460f)
                lineToRelative(160f, -160f)
                close()
                moveToRelative(120f, -20f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(140f, 0f)
                lineToRelative(-80f, -120f)
                lineToRelative(80f, -120f)
                horizontalLineToRelative(68f)
                lineToRelative(-80f, 120f)
                lineToRelative(80f, 120f)
                horizontalLineToRelative(-68f)
                close()
                moveToRelative(-340f, 0f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-30f)
                horizontalLineTo(280f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(150f)
                horizontalLineTo(340f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(60f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, 120f)
                lineTo(200f, 760f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                lineTo(520f, 760f)
                lineTo(360f, 600f)
                close()
                moveTo(200f, 760f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Score!!
    }

private var _Score: ImageVector? = null

