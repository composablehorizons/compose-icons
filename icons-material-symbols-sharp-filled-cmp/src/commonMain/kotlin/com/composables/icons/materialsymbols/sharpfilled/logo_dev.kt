package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Logo_dev: ImageVector
    get() {
        if (_Logo_dev != null) return _Logo_dev!!
        
        _Logo_dev = ImageVector.Builder(
            name = "logo_dev",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 600f)
                horizontalLineToRelative(112f)
                lineToRelative(30f, -30f)
                verticalLineToRelative(-180f)
                lineToRelative(-30f, -30f)
                horizontalLineTo(240f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(46f, -46f)
                verticalLineToRelative(-148f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(148f)
                horizontalLineToRelative(-50f)
                close()
                moveToRelative(165f, 0f)
                verticalLineToRelative(-52f)
                horizontalLineToRelative(52f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(-52f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(82f)
                verticalLineToRelative(-46f)
                horizontalLineTo(405f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(-82f)
                close()
                moveToRelative(190f, -30f)
                lineToRelative(-43f, -164f)
                horizontalLineToRelative(-48f)
                lineToRelative(63f, 239f)
                horizontalLineToRelative(56f)
                lineToRelative(63f, -239f)
                horizontalLineToRelative(-48f)
                lineToRelative(-43f, 164f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Logo_dev!!
    }

private var _Logo_dev: ImageVector? = null

