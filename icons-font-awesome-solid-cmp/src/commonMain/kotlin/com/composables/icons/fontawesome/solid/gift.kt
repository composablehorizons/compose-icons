package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(32f, 448f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(160f)
                verticalLineTo(320f)
                horizontalLineTo(32f)
                verticalLineToRelative(128f)
                close()
                moveToRelative(256f, 32f)
                horizontalLineToRelative(160f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(320f)
                horizontalLineTo(288f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(192f, -320f)
                horizontalLineToRelative(-42.1f)
                curveToRelative(6.2f, -12.1f, 10.1f, -25.5f, 10.1f, -40f)
                curveToRelative(0f, -48.5f, -39.5f, -88f, -88f, -88f)
                curveToRelative(-41.6f, 0f, -68.5f, 21.3f, -103f, 68.3f)
                curveToRelative(-34.5f, -47f, -61.4f, -68.3f, -103f, -68.3f)
                curveToRelative(-48.5f, 0f, -88f, 39.5f, -88f, 88f)
                curveToRelative(0f, 14.5f, 3.8f, 27.9f, 10.1f, 40f)
                horizontalLineTo(32f)
                curveToRelative(-17.7f, 0f, -32f, 14.3f, -32f, 32f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(480f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -17.7f, -14.3f, -32f, -32f, -32f)
                close()
                moveToRelative(-326.1f, 0f)
                curveToRelative(-22.1f, 0f, -40f, -17.9f, -40f, -40f)
                reflectiveCurveToRelative(17.9f, -40f, 40f, -40f)
                curveToRelative(19.9f, 0f, 34.6f, 3.3f, 86.1f, 80f)
                horizontalLineToRelative(-86.1f)
                close()
                moveToRelative(206.1f, 0f)
                horizontalLineToRelative(-86.1f)
                curveToRelative(51.4f, -76.5f, 65.7f, -80f, 86.1f, -80f)
                curveToRelative(22.1f, 0f, 40f, 17.9f, 40f, 40f)
                reflectiveCurveToRelative(-17.9f, 40f, -40f, 40f)
                close()
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

