package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Snowmobile: ImageVector
    get() {
        if (_Snowmobile != null) return _Snowmobile!!
        
        _Snowmobile = ImageVector.Builder(
            name = "snowmobile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                horizontalLineTo(80f)
                quadToRelative(-38f, 0f, -59f, -25f)
                reflectiveQuadTo(0f, 720f)
                quadToRelative(0f, -20f, 10f, -39f)
                reflectiveQuadToRelative(32f, -31f)
                lineToRelative(140f, -76f)
                lineTo(0f, 520f)
                lineToRelative(80f, -160f)
                lineToRelative(360f, 40f)
                lineToRelative(122f, -91f)
                lineToRelative(-32f, -29f)
                horizontalLineToRelative(-90f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(122f)
                lineToRelative(285f, 265f)
                quadToRelative(19f, 17f, 26f, 33.5f)
                reflectiveQuadToRelative(7f, 31.5f)
                quadToRelative(0f, 43f, -33f, 76.5f)
                reflectiveQuadTo(747f, 640f)
                lineToRelative(86f, 80f)
                horizontalLineToRelative(7f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(880f, 680f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(117f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(480f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(80f, 720f)
                horizontalLineToRelative(240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(400f, 640f)
                lineToRelative(-110f, -33f)
                lineTo(80f, 720f)
                close()
            }
        }.build()
        
        return _Snowmobile!!
    }

private var _Snowmobile: ImageVector? = null

