package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Raw_off: ImageVector
    get() {
        if (_Raw_off != null) return _Raw_off!!
        
        _Raw_off = ImageVector.Builder(
            name = "raw_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-52f, -304f)
                lineToRelative(-30f, -122f)
                lineToRelative(-24f, 94f)
                lineToRelative(-98f, -96f)
                lineToRelative(-28f, -116f)
                horizontalLineToRelative(60f)
                lineToRelative(30f, 120f)
                lineToRelative(30f, -120f)
                horizontalLineToRelative(60f)
                lineToRelative(30f, 120f)
                lineToRelative(30f, -120f)
                horizontalLineToRelative(60f)
                lineToRelative(-60f, 240f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-390f, 0f)
                lineToRelative(42f, -168f)
                lineToRelative(48f, 48f)
                lineToRelative(60f, 60f)
                horizontalLineToRelative(-74f)
                lineToRelative(-16f, 60f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(-230f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(156f)
                horizontalLineToRelative(-36f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-60f)
                lineToRelative(-36f, -80f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(60f, -140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Raw_off!!
    }

private var _Raw_off: ImageVector? = null

