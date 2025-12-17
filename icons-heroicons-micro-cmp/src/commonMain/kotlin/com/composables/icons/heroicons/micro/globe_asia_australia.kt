package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.GlobeAsiaAustralia: ImageVector
    get() {
        if (_GlobeAsiaAustralia != null) return _GlobeAsiaAustralia!!
        
        _GlobeAsiaAustralia = ImageVector.Builder(
            name = "globe-asia-australia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, true, 14f, 0f)
                arcTo(7f, 7f, 0f, false, true, 1f, 8f)
                close()
                moveToRelative(7f, 5.5f)
                arcToRelative(5.485f, 5.485f, 0f, false, true, -4.007f, -1.732f)
                lineToRelative(0.28f, -0.702f)
                arcToRelative(0.402f, 0.402f, 0f, false, true, 0.658f, -0.135f)
                arcToRelative(0.804f, 0.804f, 0f, false, false, 1.138f, 0f)
                lineToRelative(0.012f, -0.012f)
                arcToRelative(0.822f, 0.822f, 0f, false, false, 0.154f, -0.949f)
                lineToRelative(-0.055f, -0.11f)
                arcToRelative(0.497f, 0.497f, 0f, false, true, 0.134f, -0.611f)
                lineTo(8.14f, 7.788f)
                arcToRelative(0.57f, 0.57f, 0f, false, false, 0.154f, -0.7f)
                arcToRelative(0.57f, 0.57f, 0f, false, true, 0.33f, -0.796f)
                lineToRelative(0.028f, -0.01f)
                arcToRelative(1.788f, 1.788f, 0f, false, false, 1.13f, -1.13f)
                lineToRelative(0.072f, -0.214f)
                arcToRelative(0.747f, 0.747f, 0f, false, false, -0.18f, -0.764f)
                lineTo(8.293f, 2.793f)
                arcTo(1f, 1f, 0f, false, true, 8.09f, 2.5f)
                arcTo(5.5f, 5.5f, 0f, false, true, 12.9f, 10.5f)
                horizontalLineToRelative(-0.486f)
                arcToRelative(1f, 1f, 0f, false, true, -0.707f, -0.293f)
                lineToRelative(-0.353f, -0.353f)
                arcToRelative(1.207f, 1.207f, 0f, false, false, -1.708f, 0f)
                lineToRelative(-0.531f, 0.531f)
                arcToRelative(1f, 1f, 0f, false, true, -0.26f, 0.188f)
                lineToRelative(-0.343f, 0.17f)
                arcToRelative(0.927f, 0.927f, 0f, false, false, -0.512f, 0.83f)
                verticalLineToRelative(0.177f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.751f, 0.793f)
                curveToRelative(-0.477f, 0.135f, -0.98f, 0.207f, -1.501f, 0.207f)
                close()
            }
        }.build()
        
        return _GlobeAsiaAustralia!!
    }

private var _GlobeAsiaAustralia: ImageVector? = null

