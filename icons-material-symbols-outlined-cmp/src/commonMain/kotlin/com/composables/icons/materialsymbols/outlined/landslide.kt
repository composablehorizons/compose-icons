package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Landslide: ImageVector
    get() {
        if (_Landslide != null) return _Landslide!!
        
        _Landslide = ImageVector.Builder(
            name = "landslide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                horizontalLineToRelative(800f)
                lineTo(640f, 560f)
                lineToRelative(-200f, -80f)
                lineToRelative(-120f, -160f)
                horizontalLineTo(80f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(80f, -80f)
                verticalLineToRelative(-64f)
                lineToRelative(80f, 26f)
                lineToRelative(361f, -120f)
                lineToRelative(119f, 158f)
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -122f)
                lineToRelative(-80f, -27f)
                verticalLineToRelative(-75f)
                lineToRelative(80f, 26f)
                lineToRelative(158f, -52f)
                lineToRelative(96f, 43f)
                lineToRelative(-254f, 85f)
                close()
                moveToRelative(500f, -118f)
                lineToRelative(180f, -80f)
                verticalLineToRelative(-160f)
                lineToRelative(-180f, -40f)
                lineToRelative(-100f, 80f)
                verticalLineToRelative(120f)
                lineToRelative(100f, 80f)
                close()
                moveToRelative(-500f, -42f)
                lineToRelative(-80f, -27f)
                verticalLineToRelative(-91f)
                horizontalLineToRelative(120f)
                lineToRelative(65f, 83f)
                lineToRelative(-105f, 35f)
                close()
                moveToRelative(512f, -51f)
                lineToRelative(-32f, -25f)
                verticalLineToRelative(-44f)
                lineToRelative(40f, -32f)
                lineToRelative(80f, 18f)
                verticalLineToRelative(44f)
                lineToRelative(-88f, 39f)
                close()
                moveTo(480f, 320f)
                lineToRelative(200f, -80f)
                verticalLineToRelative(-200f)
                lineToRelative(-200f, -40f)
                lineToRelative(-120f, 80f)
                verticalLineToRelative(160f)
                lineToRelative(120f, 80f)
                close()
                moveToRelative(9f, -90f)
                lineToRelative(-49f, -33f)
                verticalLineToRelative(-74f)
                lineToRelative(57f, -38f)
                lineToRelative(103f, 21f)
                verticalLineToRelative(80f)
                lineToRelative(-111f, 44f)
                close()
            }
        }.build()
        
        return _Landslide!!
    }

private var _Landslide: ImageVector? = null

