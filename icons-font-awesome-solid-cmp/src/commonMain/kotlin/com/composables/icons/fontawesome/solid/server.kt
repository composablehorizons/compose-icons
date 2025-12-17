package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 160f)
                horizontalLineTo(32f)
                curveToRelative(-17.673f, 0f, -32f, -14.327f, -32f, -32f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.673f, 14.327f, -32f, 32f, -32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.673f, 0f, 32f, 14.327f, 32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.673f, -14.327f, 32f, -32f, 32f)
                close()
                moveToRelative(-48f, -88f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                reflectiveCurveToRelative(10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                reflectiveCurveToRelative(-10.745f, -24f, -24f, -24f)
                close()
                moveToRelative(-64f, 0f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                reflectiveCurveToRelative(10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                reflectiveCurveToRelative(-10.745f, -24f, -24f, -24f)
                close()
                moveToRelative(112f, 248f)
                horizontalLineTo(32f)
                curveToRelative(-17.673f, 0f, -32f, -14.327f, -32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.673f, 14.327f, -32f, 32f, -32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.673f, 0f, 32f, 14.327f, 32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.673f, -14.327f, 32f, -32f, 32f)
                close()
                moveToRelative(-48f, -88f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                reflectiveCurveToRelative(10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                reflectiveCurveToRelative(-10.745f, -24f, -24f, -24f)
                close()
                moveToRelative(-64f, 0f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                reflectiveCurveToRelative(10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                reflectiveCurveToRelative(-10.745f, -24f, -24f, -24f)
                close()
                moveToRelative(112f, 248f)
                horizontalLineTo(32f)
                curveToRelative(-17.673f, 0f, -32f, -14.327f, -32f, -32f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -17.673f, 14.327f, -32f, 32f, -32f)
                horizontalLineToRelative(448f)
                curveToRelative(17.673f, 0f, 32f, 14.327f, 32f, 32f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 17.673f, -14.327f, 32f, -32f, 32f)
                close()
                moveToRelative(-48f, -88f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                reflectiveCurveToRelative(10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                reflectiveCurveToRelative(-10.745f, -24f, -24f, -24f)
                close()
                moveToRelative(-64f, 0f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                reflectiveCurveToRelative(10.745f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.745f, 24f, -24f)
                reflectiveCurveToRelative(-10.745f, -24f, -24f, -24f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

