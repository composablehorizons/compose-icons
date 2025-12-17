package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Csv: ImageVector
    get() {
        if (_Csv != null) return _Csv!!
        
        _Csv = ImageVector.Builder(
            name = "csv",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(230f, 600f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-60f)
                horizontalLineTo(250f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(230f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(190f, 400f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(230f, 600f)
                close()
                moveToRelative(156f, 0f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(546f, 560f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, -11.5f, -31.5f)
                reflectiveQuadTo(506f, 454f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-34f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(426f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(386f, 400f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, 11.5f, 30.5f)
                reflectiveQuadTo(426f, 504f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(36f)
                horizontalLineTo(386f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(264f, 0f)
                horizontalLineToRelative(60f)
                lineToRelative(70f, -240f)
                horizontalLineToRelative(-60f)
                lineToRelative(-40f, 138f)
                lineToRelative(-40f, -138f)
                horizontalLineToRelative(-60f)
                lineToRelative(70f, 240f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Csv!!
    }

private var _Csv: ImageVector? = null

