package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Docs_apps_script: ImageVector
    get() {
        if (_Docs_apps_script != null) return _Docs_apps_script!!
        
        _Docs_apps_script = ImageVector.Builder(
            name = "docs_apps_script",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 760f)
                horizontalLineToRelative(113f)
                lineToRelative(-92f, -65f)
                quadToRelative(-14f, -10f, -16.5f, -25.5f)
                reflectiveQuadTo(531f, 640f)
                quadToRelative(9f, -14f, 25f, -16.5f)
                reflectiveQuadToRelative(30f, 6.5f)
                lineToRelative(93f, 64f)
                lineToRelative(-39f, -106f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 31f, 1f)
                reflectiveQuadToRelative(21f, 23f)
                lineToRelative(38f, 106f)
                lineToRelative(30f, -109f)
                quadToRelative(5f, -16f, 18.5f, -24.5f)
                reflectiveQuadTo(832f, 530f)
                quadToRelative(16f, 5f, 25f, 18.5f)
                reflectiveQuadToRelative(4f, 29.5f)
                lineToRelative(-62f, 232f)
                quadToRelative(-4f, 14f, -14.5f, 22f)
                reflectiveQuadToRelative(-24.5f, 8f)
                horizontalLineTo(520f)
                close()
                moveTo(120f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(283f)
                quadToRelative(-3f, 21f, -2.5f, 40f)
                reflectiveQuadToRelative(3.5f, 40f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(386f)
                quadToRelative(-23f, 16f, -41.5f, 36f)
                reflectiveQuadTo(432f, 560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Docs_apps_script!!
    }

private var _Docs_apps_script: ImageVector? = null

