package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Hdmi: ImageVector
    get() {
        if (_Hdmi != null) return _Hdmi!!
        
        _Hdmi = ImageVector.Builder(
            name = "hdmi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3.293f)
                curveToRelative(0f, 0.39f, 0.317f, 0.707f, 0.707f, 0.707f)
                curveToRelative(0.188f, 0f, 0.368f, 0.075f, 0.5f, 0.207f)
                lineToRelative(0.5f, 0.5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, 0.293f)
                horizontalLineToRelative(11.172f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, -0.293f)
                lineToRelative(0.5f, -0.5f)
                arcToRelative(0.7f, 0.7f, 0f, false, true, 0.5f, -0.207f)
                curveToRelative(0.39f, 0f, 0.707f, -0.317f, 0.707f, -0.707f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(1.5f, 2f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
            }
        }.build()
        
        return _Hdmi!!
    }

private var _Hdmi: ImageVector? = null

