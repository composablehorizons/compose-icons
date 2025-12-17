package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Privacy_screen_off: ImageVector
    get() {
        if (_Privacy_screen_off != null) return _Privacy_screen_off!!
        
        _Privacy_screen_off = ImageVector.Builder(
            name = "privacy_screen_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(818f, 1028f)
                lineTo(686f, 896f)
                horizontalLineTo(136f)
                lineToRelative(275f, -275f)
                lineToRelative(-56f, -56f)
                lineTo(80f, 840f)
                verticalLineTo(673f)
                lineToRelative(191f, -192f)
                lineToRelative(-56f, -56f)
                lineTo(80f, 560f)
                verticalLineTo(336f)
                quadToRelative(0f, -10f, 4f, -17.5f)
                reflectiveQuadTo(94f, 304f)
                lineToRelative(-68f, -68f)
                lineToRelative(57f, -57f)
                lineToRelative(792f, 792f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(62f, -166f)
                lineTo(525f, 507f)
                lineToRelative(251f, -251f)
                horizontalLineToRelative(24f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 336f)
                verticalLineToRelative(526f)
                close()
                moveTo(469f, 451f)
                lineToRelative(-84f, -84f)
                lineToRelative(111f, -111f)
                horizontalLineToRelative(167f)
                lineTo(469f, 451f)
                close()
                moveTo(329f, 311f)
                lineToRelative(-55f, -55f)
                horizontalLineToRelative(110f)
                lineToRelative(-55f, 55f)
                close()
            }
        }.build()
        
        return _Privacy_screen_off!!
    }

private var _Privacy_screen_off: ImageVector? = null

