package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Scale: ImageVector
    get() {
        if (_Scale != null) return _Scale!!
        
        _Scale = ImageVector.Builder(
            name = "scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.756f)
                arcToRelative(49.106f, 49.106f, 0f, false, true, 9.152f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.152f, 1.485f)
                horizontalLineToRelative(-1.918f)
                lineToRelative(2.474f, 10.124f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.375f, 0.84f)
                arcTo(6.723f, 6.723f, 0f, false, true, 18.75f, 18f)
                arcToRelative(6.723f, 6.723f, 0f, false, true, -3.181f, -0.795f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.375f, -0.84f)
                lineToRelative(2.474f, -10.124f)
                horizontalLineTo(12.75f)
                verticalLineToRelative(13.28f)
                curveToRelative(1.293f, 0.076f, 2.534f, 0.343f, 3.697f, 0.776f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.262f, 1.453f)
                horizontalLineToRelative(-8.37f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.262f, -1.453f)
                curveToRelative(1.162f, -0.433f, 2.404f, -0.7f, 3.697f, -0.775f)
                verticalLineTo(6.24f)
                horizontalLineTo(6.332f)
                lineToRelative(2.474f, 10.124f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.375f, 0.84f)
                arcTo(6.723f, 6.723f, 0f, false, true, 5.25f, 18f)
                arcToRelative(6.723f, 6.723f, 0f, false, true, -3.181f, -0.795f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.375f, -0.84f)
                lineTo(4.168f, 6.241f)
                horizontalLineTo(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.152f, -1.485f)
                arcToRelative(49.105f, 49.105f, 0f, false, true, 9.152f, -1f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(4.878f, 13.543f)
                lineToRelative(1.872f, -7.662f)
                lineToRelative(1.872f, 7.662f)
                horizontalLineToRelative(-3.744f)
                close()
                moveToRelative(-9.756f, 0f)
                lineTo(5.25f, 8.131f)
                lineToRelative(-1.872f, 7.662f)
                horizontalLineToRelative(3.744f)
                close()
            }
        }.build()
        
        return _Scale!!
    }

private var _Scale: ImageVector? = null

