package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hardware: ImageVector
    get() {
        if (_Hardware != null) return _Hardware!!
        
        _Hardware = ImageVector.Builder(
            name = "hardware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 800f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                lineTo(600f, 320f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 840f)
                horizontalLineTo(400f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(360f)
                quadToRelative(-26f, 0f, -49f, 10.5f)
                reflectiveQuadTo(271f, 240f)
                horizontalLineToRelative(169f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(40f, 40f)
                close()
            }
        }.build()
        
        return _Hardware!!
    }

private var _Hardware: ImageVector? = null

