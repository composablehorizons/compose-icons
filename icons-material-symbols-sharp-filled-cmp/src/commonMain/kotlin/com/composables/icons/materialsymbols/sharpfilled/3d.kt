package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`3d`: ImageVector
    get() {
        if (_3d != null) return _3d!!
        
        _3d = ImageVector.Builder(
            name = "3d",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 360f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, -40f)
                verticalLineToRelative(-160f)
                lineToRelative(-40f, -40f)
                horizontalLineTo(520f)
                close()
                moveToRelative(60f, 180f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-320f, 60f)
                horizontalLineToRelative(160f)
                lineToRelative(20f, -20f)
                verticalLineToRelative(-80f)
                lineToRelative(-20f, -20f)
                lineToRelative(20f, -20f)
                verticalLineToRelative(-80f)
                lineToRelative(-20f, -20f)
                horizontalLineTo(260f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(30f)
                horizontalLineTo(260f)
                verticalLineToRelative(60f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _3d!!
    }

private var _3d: ImageVector? = null

