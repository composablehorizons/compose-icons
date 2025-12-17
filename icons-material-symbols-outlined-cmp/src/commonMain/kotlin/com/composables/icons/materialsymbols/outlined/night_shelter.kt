package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Night_shelter: ImageVector
    get() {
        if (_Night_shelter != null) return _Night_shelter!!
        
        _Night_shelter = ImageVector.Builder(
            name = "night_shelter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 720f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(600f, 480f)
                horizontalLineTo(460f)
                verticalLineToRelative(140f)
                horizontalLineTo(320f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(110f, -120f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(440f, 550f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(390f, 500f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(340f, 550f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(390f, 600f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-480f)
                lineToRelative(320f, -240f)
                lineToRelative(320f, 240f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(240f, -270f)
                close()
            }
        }.build()
        
        return _Night_shelter!!
    }

private var _Night_shelter: ImageVector? = null

