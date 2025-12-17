package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Soba: ImageVector
    get() {
        if (_Soba != null) return _Soba!!
        
        _Soba = ImageVector.Builder(
            name = "soba",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(139f, 880f)
                lineTo(80f, 640f)
                horizontalLineToRelative(69f)
                quadToRelative(2f, -9f, 5f, -18f)
                reflectiveQuadToRelative(6f, -17f)
                verticalLineToRelative(-445f)
                lineToRelative(720f, -80f)
                verticalLineToRelative(60f)
                lineToRelative(-460f, 52f)
                verticalLineToRelative(68f)
                horizontalLineToRelative(460f)
                verticalLineToRelative(60f)
                horizontalLineTo(420f)
                verticalLineToRelative(65f)
                quadToRelative(14f, -2f, 29.5f, -3.5f)
                reflectiveQuadTo(480f, 380f)
                quadToRelative(121f, 0f, 212f, 74f)
                reflectiveQuadToRelative(118f, 186f)
                horizontalLineToRelative(70f)
                lineTo(819f, 880f)
                horizontalLineTo(139f)
                close()
                moveToRelative(94f, -240f)
                horizontalLineToRelative(64f)
                quadToRelative(23f, -54f, 72f, -87f)
                reflectiveQuadToRelative(111f, -33f)
                quadToRelative(62f, 0f, 110.5f, 33f)
                reflectiveQuadToRelative(71.5f, 87f)
                horizontalLineToRelative(64f)
                quadToRelative(-26f, -78f, -92.5f, -129f)
                reflectiveQuadTo(480f, 460f)
                quadToRelative(-88f, 0f, -154.5f, 51f)
                reflectiveQuadTo(233f, 640f)
                close()
                moveToRelative(158f, 0f)
                horizontalLineToRelative(177f)
                quadToRelative(-17f, -19f, -39.5f, -29.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-26f, 0f, -49f, 10.5f)
                reflectiveQuadTo(391f, 640f)
                close()
                moveTo(220f, 501f)
                quadToRelative(9f, -11f, 19f, -21f)
                reflectiveQuadToRelative(21f, -19f)
                verticalLineToRelative(-141f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(181f)
                close()
                moveToRelative(100f, -81f)
                quadToRelative(10f, -5f, 19.5f, -9.5f)
                reflectiveQuadTo(360f, 402f)
                verticalLineToRelative(-82f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(100f)
                close()
                moveTo(220f, 260f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-50f)
                lineToRelative(-40f, 4f)
                verticalLineToRelative(46f)
                close()
                moveToRelative(100f, 0f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-62f)
                lineToRelative(-40f, 5f)
                verticalLineToRelative(57f)
                close()
            }
        }.build()
        
        return _Soba!!
    }

private var _Soba: ImageVector? = null

